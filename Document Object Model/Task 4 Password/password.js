
let b=document.getElementById("spnid");
function sample()
{
    let a=document.getElementById("pwd").value;
    

    let info;
    if(a.length>5 && a.length<8)
    {
        info="Password Strong";
        b.style.color="green";

    }

    else if (a.length<5 && a.length>3)
    {
        info="week";
        b.style.color="red";
    }

    else if(a.length==0)
    {
        info="Too Weak"
    }
    b.innerText=info;
}