<?php
//get data from form  
$name = $_POST['Name'];
$email= $_POST['Email Address'];
$sub= $_POST['Subject'];
$message= $_POST['message'];

$to = "www.anish2k2@gmail.com";

$subject = "Mail From APR Bricks and Blocks";
$txt ="Name = ". $name . "\r\n  Email = " . $email . "\r\n Subject =" . $sub . "\r\n Message =" . $message;

$headers = "From: noreply@apr.com" . "\r\n" .
"CC: somebodyelse@example.com";
//carbon copy

if($email!=NULL){
    mail($to,$subject,$txt,$headers);
}

//redirect
header("Location:index.html");

?>