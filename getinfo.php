<?php

include_once 'db.php';

$sql = "SELECT      Punkte
                        FROM
                               kunde
                        WHERE
                               Name = '" .$user."'
                ";
        $result = mysqli_query($connid, $sql) OR die("<pre>\n" . $sql . "</pre>\n" . mysqli_error());
        $row = mysqli_fetch_assoc($result);
        $point = $row['Punkte']+10;

        $sql = "UPDATE
                                kunde
                        SET
                                Punkte =  '".$point."'
                              
                        WHERE
                                Name = '" .$user."'
                       ";   
                mysqli_query($connid,$sql) OR die("<pre>\n".$sql."</pre>\n".mysqli_error());

include_once 'dbclose.php';
?>
