<?php

error_reporting(E_ALL);


$config = parse_ini_file('config.ini');
$connid = mysqli_connect($config['servername'], $config['username'], $config['password'], $config['dbname']) OR die("Error: " . mysqli_error());

mysqli_close($connid);
?>
