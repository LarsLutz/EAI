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
	$response ->speech =$speech."\n Du hast jetzt 10 Punkte";
	$response->displayText=$speech."\n Du hast jetzt 10 Punkte";
	$response-> source=$text;
	echo json_encode($response);
	
	
}
else
{
	echo "Methode nicht erlaubt";
}


?>
