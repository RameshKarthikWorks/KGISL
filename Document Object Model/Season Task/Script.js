let smallImage = document.getElementById("SmallImage");

let MediumImage = document.getElementById("MediumImage");

let springsmallimage  = "https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/seasons-switcher-spring-xs-img.png"
let springmediummage = "https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/seasons-switcher-spring-md-img.png"
let summersmallimage   = "https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/seasons-switcher-summer-xs-img.png"
let summermediumimage = "https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/seasons-switcher-summer-md-img.png"
let autumnsmallimage = "https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/seasons-switcher-autumn-xs-img.png"
let autumnmediumimage  = "https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/seasons-switcher-autumn-md-img.png"
let wintersmallimage  = "https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/seasons-switcher-winter-xs-img.png"
let wintermediumimage = "https://d1tgh8fmlzexmh.cloudfront.net/ccbp-dynamic-webapps/seasons-switcher-winter-md-img.png"


function Spring() {
    smallImage.src = springsmallimage;
    MediumImage.src = springmediummage;

}

function Summer() {
    smallImage.src = summersmallimage;
    MediumImage.src = summermediumimage;
}

function Autumn() {
    smallImage.src = autumnsmallimage;
    MediumImage.src = autumnmediumimage;
}

function Winter() {
    smallImage.src = wintersmallimage;
    MediumImage.src = wintermediumimage;
}