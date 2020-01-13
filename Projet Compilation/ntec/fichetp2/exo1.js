function ajouter()
{
var x=document.createElement("h3");
 var y=document.createTextNode("hello world");
    x.appendChild(y);
document.getElementById("demo").appendChild(x);
}