    function charger(){
var xhttp;
    if(window.XMLHttpRequest){
    xhttp=new XMLHttpRequest();
    }
        else{
            xhttp=new ActiveXObject("microsoft.XMLHTTP");
        }
    xhttp.onreadystatechange=callback,
        xhttp.open("GET","exo1.html",true);
    xhttp.send();


}
function callback(){
if(this.readyState==4 && this.status==200){
document.getElementById("demo").innerHTML=this.responseText;
}
    
};