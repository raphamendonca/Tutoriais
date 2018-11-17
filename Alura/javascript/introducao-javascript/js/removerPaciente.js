var tabelaPacientes = document.querySelector("#tabela-pacientes");

tabelaPacientes.addEventListener("dblclick", function(event){
    var alvo = event.target;
    var paiDoAlvo = alvo.parentNode;
    paiDoAlvo.remove();
})