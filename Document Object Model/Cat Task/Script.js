let a= document.getElementById("bulb");

let b= document.getElementById("cat");


let c= document.getElementById("back");

let d=document.getElementById("on")

let e=document.getElementById("off")

function on()
{
   a.src="https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/bulb-go-off-img.png"

   b.src="https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/cat-eyes-img.png"

c.style.backgroundColor="black";
d.style.backgroundColor="grey";
d.style.color="black";

   
}


function off()
{
    a.src="https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/bulb-go-on-img.png"

    b.src="https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/cat-img.png"

    c.style.backgroundColor="black";

    e.style.backgroundColor="red";
e.style.color="black";
}

