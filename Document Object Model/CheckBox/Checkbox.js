let a=document.getElementById("divid");
a.classList.add("text-center","bg-success","p-5");


let b=document.createElement("input");
b.type="checkbox";
b.id="inpid";
a.appendChild(b);


let c=document.createElement("label");
c.setAttribute("for","label");
c.textContent="click me";
a.appendChild(c);