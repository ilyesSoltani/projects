function load(){
var xhttp;
	if(window.XMLHttpRequest){
	xhttp=new XMLHttpRequest();
	}
	else{
		xhttp=new ActiveXObject("microsoft.XMLHTTP");
	}
	xhttp.onreadystatechange=appel,
	xhttp.open("GET","exo1.html",true);
	xhttp.send();
}

function appel(){
if(this.readyState==4 && this.status==200){
document.getElementById("A").innerHTML=this.responseText;
}
}