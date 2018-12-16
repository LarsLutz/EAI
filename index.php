<?php

$method =$_SERVER['REQUEST_METHOD'];


if($method =="POST"){
	$requestBody =file_get_contents('php://input');
	$json =json_decode($requestBody);
	
	$text=$json ->result->parameters->Topping;
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
		$speech= "Can't find that lable";
		break;
		
	}
	
	$response =new \stdClass();
	$response ->speech =$speech;
	$response->displayText=$speech;
	$response-> source=$text;
	echo json_encode($response);
	
	$response2 =new \stdClass();
	$response2 ->speech ="Du hast jetzt 10 Punkte";
	$response2->displayText= "Du hast jetzt 10 Punkte";
	$response2-> source=$text;
	echo json_encode($response2);
	
}
else
{
	echo "Methode nicht erlaubt";
}


?>
