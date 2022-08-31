//ArrayList contendo tarefas 
var tarefas = [];

let Tarefa = class Tarefa {
    constructor(titulo, descricao, categoria, prioridade){
        this.titulo = titulo;
        this.descricao = descricao; 
        this.categoria = categoria;
        this.prioridade = prioridade;
    }   
};

//Coletar os dados de entrada da tarefa 
document.getElementById("adicionar_tarefa").onclick = function(){
    //Coletando o nome 
    var titulo = document.getElementById("entrada_titulo").value;
    //Coletando a descrição
    var descricao = document.getElementById("entrada_descricao").value;
    //Coletando a categoria
    var indice_categoria = document.getElementById("entrada_categoria").options.selectedIndex;
    var categoria = document.getElementById("entrada_categoria")[indice_categoria].innerHTML;
    //Coletando a prioridade
    var prioridade = document.getElementById("entrada_prioridade").options.selectedIndex;


    let tarefa = new Tarefa(titulo, descricao, categoria, prioridade);

 

    console.log("Objeto construido: " + tarefa);
    
    tarefas.push(tarefa);

    console.log(tarefas);

    criaTarefa(tarefa);
};


let criaTarefa = (tarefa) => {
    document.getElementById("lista_tarefas").innerHTML += `
    <div>
    <p>${tarefa.titulo}</p>
    <p>${tarefa.descricao}</p>
    <p>${tarefa.categoria} </p> 
    <p>Nivel de prioridade: ${tarefa.prioridade}</p>
    <span class="options">
      <i onClick="deletaTarefa(this)" class="fas fa-trash-alt"></i>
    </span>
    </div>
    `
}; 

let deletaTarefa = (e) => {
    e.parentElement.parentElement.remove();
}

