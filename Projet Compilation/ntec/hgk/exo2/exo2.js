function load() {
var xhttp;
    if (window.XMLHttpRequest)
    {
        xhttp = new XMLHttpRequest();
    }
    else
    {
        xhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
xhttp.onreadystatechange=function()
    {
        if (this.readyState==4 && this.status==200)
        {
            myfunction(xhttp.responseXML);
        }
    };
xhttp.open("GET","exo2.xml",true);
xhttp.send();
}

function myfunction(xmldoc){
    var table="<tr>"+
     "<th>Expediteur</th>"+
     "<th>Destinatair</th>"+
     "<th>Sujet</th>"+
     "<th>Objects</th>";
    var root=xmldoc.getElementsByTagName("email");
    for(i=0;i<root.length;i++)
    {
        Expediteur=root[i].getElementsByTagName("expediteur")[0].childNodes[0].nodeValue;
        Destinair=root[i].getElementsByTagName("destinateur")[0].childNodes[0].nodeValue;
        Sujet=root[i].getElementsByTagName("sujet")[0].childNodes[0].nodeValue;
        objet=root[i].getElementsByTagName("objet")[0].childNodes[0].nodeValue;

        table+="</tr><tr>"+
        "<td>"+Expediteur+" "+"</td>"+
        "<td>"+Destinair+"</td>"+
        "<td>"+Sujet+"</td>"+
        "<td>"+objet+"</td>"+
        "<tr>";
    }
document.getElementById("table1").innerHTML=table;
}