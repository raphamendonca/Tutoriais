console.log("Javascript")

var titulo = document.querySelector(".titulo");

titulo.textContent = "Aparecida Nutricionista";

var paciente = document.querySelector("campo")

var tdPeso = paciente.querySelector(".info-peso");
var peso = tdPeso.textContent;

var tdAltura = paciente.querySelector(".info-altura");
var altura = tdAltura.textContent;


var camposValidos = true;

if(peso <0 || peso > 1000){
    console.log("Peso inválido");
    camposValidos = false;
    tdPeso.textContent = "Peso inválido";
}
if(altura < 0 || altura > 3){
    console.log("Altura inválido");
    camposValidos = false;
    tdAltura.textContent = "Altura Inválida";
}

if(camposValidos){
    var imc = peso / (altura **altura);
}


var botaoAdicionar =document.querySelector("#adicionar-paciente");
botaoAdicionar.addEventListener("click", function(event){
    event.preventDefault();
    console.log("Oi eu sou o botão e fui clicado");

    var form = document.querySelector("#form-adicionar");

    var nome = form.nome.value;
    var peso = form.peso.value;
    var altura = form.altura.value;
    var gordura = form.gordura.value;

    console.log(nome + " | " + peso + " | " + altura  + " | " + gordura)

});

titulo.addEventListener("click", function(){
    console.log("fui clicado");
});

