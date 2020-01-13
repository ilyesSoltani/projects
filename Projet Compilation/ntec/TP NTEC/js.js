function permuter() {  
var x;
 x = document.getElementById("p1").innerHTML;
document.getElementById("p1").innerHTML = document.getElementById("p2").innerHTML;
document.getElementById("p2").innerHTML = x;   
    
}

function afficher() {
var K = document.getElementById("p1");
alert("nodeName : "+K.nodeName);
alert("nodeType :"+K.nodeType);

alert("nodeValue :"+K.firstChild.nodeValue);
}

function permuter2(){

var table = document.getElementsByTagName("p");
var x=table[0].innerHTML;
table[0].innerHTML = table[1].innerHTML;
table[1].innerHTML = x;

}


function count(){
   var ul = document.getElementById("VL");
    var li = [];

    for (var i = 0; i < ul.childNodes.length; i++) {
        if (ul.childNodes[i].nodeName == "LI") {
            li.push(ul.childNodes[i]);
        }
    }
alert(total = li.length);


 }

 function items(){
 	var myliste= document.getElementById("VL");
 	var li = myliste.getElementsByTagName("li");
 	alert("items : "+li[0].innerHTML+ "/" +li[1].innerHTML+ "/" +li[2].innerHTML+ "/" +li[3].innerHTML);
 }

function boucle() {

var list = document.getElementById("list");
for (var child =list.firstChild; child!=null; child=child.nextSibling) {
   alert(child.innerHTML);
}	
}

