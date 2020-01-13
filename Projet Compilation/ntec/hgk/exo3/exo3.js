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
               callback(xhttp.responseText);
            }
        };
    xhttp.open("GET","exo3.json",true);
    xhttp.send();
    }
    
    function callback(xmldoc){
        var table="<li>Mail";
        var root= JSON.parse(xmldoc);
       
        for(i=0;i<1;i++)
        {
        
            Expediteur=root.email[i].expediteur;
            Destinair=root.email[i].destinatair;
            Sujet=root.email[i].sujet;
            objet=root.email[i].objet;
            table+="<ol>"+
            "<li>"+Expediteur+"</li>"+
            "<li>"+Destinair+"</li>"+
            "<li>"+Sujet+"</li>"+
            "<li>"+objet+"</li>"+
            "</ol>";
            if(i<1)
                table+="<li>Mail";
        }
    document.getElementById("table1").innerHTML=table;
    }           