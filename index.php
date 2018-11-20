<?php

$method =$_SERVER['REQUEST_METHOD'];


if($method =="POST"){
	$requestBody =file_get_contents('php://input');
	$json =json_decode($requestBody);
	
	$text=$json ->result->parameters->topping;
	
	switch ($text){
		
		case 'ham':
		$speech ="I order a ham pizza";
		break;
		
		case 'cheese':
		$speech ="I order a cheese pizza";
		break;
		
		case 'vegi':
		$speech ="I order a vegi pizza";
		break;
		
		default:
		$speech="Sorry, I havent this type of pizza.";
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
