function ajouter() 
{
     var row=document.createElement("tr");
for(i=0;i<4;i++){
    
   
    var x=document.createElement("td");
    var y=document.createElement("input");
    y.setAttribute("type","text");
    x.appendChild(y);
    row.appendChild(x);
    document.getElementById("table").appendChild(row);
    
}
}
    
function supprimer()
{
    var x=document.getElementById("table");
for (i=0;i<x.getElementsByTagName("tr").length;i++){
    
    var y=x.getElementsByTagName("tr")[i];
    y.removeChild(y.lastElementChild);

}
}
function insert(){
           for(i=0;i<document.getElementsByTagName("tr").length;i++)
           {
           var x=document.getElementsByTagName("tr")[i];
            var   y=x.firstElementChild;
               var z=document.createElement("td");
               x.insertBefore(z,y);
           
           
           }
    
    }

    









