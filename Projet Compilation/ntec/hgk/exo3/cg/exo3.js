function load()
{
var xhttp;
	if(window.XMLHttpRequest)
	{
		xhttp=new XMLHttpRequest();
	}
	else
	{
		xhttp=new ActiveXobject("Microsoft.XMLHTTP");
	}
xhttp.onreadystatechange = function()
{
	if(this.readyState == 4 && this.status == 200)
	{
		myfunction(xhttp.responseText);
	}
};
xhttp.open("GET","exo3.json",true);
xhttp.send();
}


function myfunction(jsondoc){
	var liste="<li>mail</li>";

	var root=JSON.parse(jsondoc);

for(i=0;i<root.mail.length;i++)
{
	Expediteur=root.mail[i].expediteur;
	Destinataire=root.mail[i].destinataire;
	Sujet=root.mail[i].sujet;
	Objet=root.mail[i].objet;
	liste+="<ol>"+
	"<li>"+Expediteur+"</li>"+
	"<li>"+Destinataire+"</li>"+
	"<li>"+Sujet+"</li>"+
	"<li>"+Objet+"</li>"+
	"</ol>";
	if(i<root.mail.length-1)
		liste+="<li>mail</li>";
}
document.getElementById("table1").innerHTML=liste;
}