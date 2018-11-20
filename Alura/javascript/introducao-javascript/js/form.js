var botaoAdicionar = document.querySelector("#adicionar-paciente");
botaoAdicionar.addEventListener("click", function(event) {
    event.preventDefault();

    var form = document.querySelector("#form-adiciona");

    var paciente = obtemPacienteDoFormulario(form);

    var erros = validaPaciente(paciente);

    if(erros.length > 0 ){
        exibeMensagensErro(erros);      
        return;
    }
    adicionaPacienteNaTabela(paciente);
    
    form.reset();
    limparMsgErro();

});

function adicionaPacienteNaTabela(paciente){
    var pacienteTr = montaTr(paciente);
    var tabela = document.querySelector("#tabela-pacientes"); 
    tabela.appendChild(pacienteTr);
}

function limparMsgErro(){
    var msgsErro = document.querySelector("#mensagens-erro");
    msgsErro.innerHTML = "";
}

function exibeMensagensErro(erros){
    var ul = document.querySelector("#mensagens-erro");
    limparMsgErro();
    erros.forEach(function(erro){
        ul.appendChild(montaLi(erro));    
    });
}

function obtemPacienteDoFormulario(form) {

    var paciente = {
        nome: form.nome.value,
        peso: form.peso.value,
        altura: form.altura.value,
        gordura: form.gordura.value,
        imc: calculaImc(form.peso.value, form.altura.value)
    }

    return paciente;
}

function montaTd(dado, classe) {
    var td = document.createElement("td");
    td.classList.add(classe);
    td.textContent = dado;

    return td;
}

function montaTr(paciente) {
    //Cria TR
    var pacienteTr = document.createElement("tr");
    pacienteTr.classList.add("paciente");
    //Cria as TD's e a adiciona dentro da TR
    pacienteTr.appendChild(montaTd(paciente.nome, "info-nome"));
    pacienteTr.appendChild(montaTd(paciente.peso, "info-peso"));
    pacienteTr.appendChild(montaTd(paciente.altura, "info-altura"));
    pacienteTr.appendChild(montaTd(paciente.gordura, "info-gordura"));
    pacienteTr.appendChild(montaTd(paciente.imc, "info-imc"));
    // retorna a TR
    return pacienteTr;  
}

function validaPaciente(paciente){
    var msgs = [];
    if(paciente.nome.length == 0){
        msgs.push("O nome não pode ser em branco!");
    }
    if(paciente.peso.length == 0){
        msgs.push("O peso não pode ser em branco!");
    }
    if(paciente.altura.length == 0 ){
        msgs.push("A altura não pode ser em branco!");
    }
    if(paciente.gordura.length == 0){
        msgs.push("A gordura não pode ser em branco!");
    }
    if(!validaPeso(paciente.peso)){
        msgs.push("O peso é inválido!");
    }
    if(!validaAltura(paciente.altura)){
        msgs.push("A Altura é inválida!");
    }
    return msgs;
}

function montaLi(erro){
    var li = document.createElement("li");
    li.textContent = erro;
    return li;
}