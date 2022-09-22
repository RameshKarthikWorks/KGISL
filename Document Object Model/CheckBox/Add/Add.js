function additem()
{
    var a=document.getElementById("btt");
    var b= document.createElement("li");
    var c=document.getElementById("uu");
    b.textContent=a.value;
    a.value=" ";
    c.appendChild(b);
}