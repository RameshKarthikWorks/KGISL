let main = document.getElementById("divmain");
main.style.height="400px";
main.style.width="450px";
main.classList.add("divmain");
main.style.border="1px solid black";


let b=document.getElementById("head");
b.textContent="Change Random Colors by clicking the Button";
b.style.marginTop="-300px";
b.style.textAlign="center";
main.appendChild(b);


let a= document.getElementById("divid");
a.style.height="150px";
a.style.width="150px";
a.style.backgroundColor="black";
a.style.marginTop="200px";
a.style.marginLeft="150px";


let c= document.getElementById("button");
c.textContent="Click Me";
c.style.marginTop="10px";
c.style.marginLeft="175px";
c.style.backgroundColor="grey";
c.style.color="white";

main.appendChild(c);


let bgColorsArray = ["#e75d7c"
,
"#b16cef"
,
"#53cca4"
,
"#efc84d"
,
"#628ef0"
,
"#184b73"
,
"#883e7f"
,
"#ed048b"];


function randomcolors()
{

    
    a.style.backgroundColor = bgColorsArray[Math.ceil(Math.random() * bgColorsArray.length)];

}





