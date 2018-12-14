<?php

$method =$_SERVER['REQUEST_METHOD'];


if($method =="POST"){
	$requestBody =file_get_contents('php://input');
	$json =json_decode($requestBody);
	
	$text=$json ->result->parameters->topping;
	
	switch ($text){
		
		case 'Nesquik':
		$speech ="I order Nesquik flakes";
		break;
		
		case 'Frostys':
		$speech ="I order Frostys";
		break;
		
		case 'Frootloops':
		$speech ="I order Frootloops";
		break;
		
		default:
		$speech="Sorry, I havent found this label.";
		break;
		
	}
	
	$response =new \stdClass();
	$response ->speech =$speech;
	$response->displayText=$speech;
	$response-> source="webhook";
	echo json_encode($response);
	
}
else
{
	echo "Methode nicht erlaubt";
}


?>
