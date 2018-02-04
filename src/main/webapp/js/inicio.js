function Login(){ 
var done=0; 
var usuario=document.login.usuario.value; 
var password=document.login.password.value; 
if (usuario=="U" && password=="C") { 
window.location="index.html"; 
} 
else if (usuario=="U2" && password=="C2") { 
window.location="index.html"; 
} 
else if (usuario=="" && password=="") { 
window.location="errordecontrasena.html"; 
} 
else if (done==0){

window.location="errordecontrasena.html"; 


}

} 