<?php
$method =$_SERVER['REQUEST_METHOD'];
if($method =="POST"){
	$requestBody =file_get_contents('php://input');
	$json =json_decode($requestBody);
	
        $user =$json ->result->parameters->user;
	$text=$json ->result->parameters->Topping;
	switch ($text){
		
		case 'Nesquik':
		$speech ="I order Nesquik flakes. It costs 10$ paied by your creditcard";
		break;
		
		case 'Frostys':
		$speech ="I order Frostys. It costs 12$ paied by your creditcard";
		break;
		
		case 'Frootloops':
		$speech ="I order Frootloops.It costs 13$ paied by your creditcard";
		break;
		
		default:
		$speech= "Can't find that lable";
		break;
		
	}
        
        include_once 'getinfo.php';
	
	$response =new \stdClass();
	$response ->speech =$speech."  You have ".$point." points now!";
	$response->displayText=$speech."  You have ".$point." points now!";
	$response-> source=$text;
	echo json_encode($response);
	
	
}
else
{
	echo "Methode nicht erlaubt";
}
?>