function remplacer(){
     y=document.getElementById("myliste");
       x=document.getElementById("para");
    
    createdItem1=document.createElement("li");
    createdText1=document.createTextNode("eclipse");
    createdItem1.appendChild(createdText1);
    
    createdItem2=document.createElement("li"); 
    createdText2=document.createTextNode("netbeans");
    createdItem2.appendChild(createdText2);
    
    createdItem3=document.createElement("ol"); 
    createdItem3.appendChild(createdItem1);
    createdItem3.appendChild(createdItem2);
    
    createdItem=document.createElement("li");
    createdText=document.createTextNode("IDE");
    createdItem.appendChild(createdText);
    createdItem.appendChild(createdItem3);
    
    
    y.replaceChild(createdItem,x);
    

}