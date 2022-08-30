//Esboço da classe tarefa 
tarefa = {
    'titulo':'',
    'descricao':'',
    'categoria':'', 
    'prioridade':''
}

//Coletar os dados de entrada da tarefa 
document.getElementById("adicionar_tarefa").onclick = function(){
    //Coletando o nome 
    var titulo = document.getElementById("entrada_titulo").value;
    //Coletando a descrição
    var descricao = document.getElementById("entrada_descricao").value;
    //Coletando a categoria
    var categoria = document.getElementById("entrada_categoria").options.selectedIndex;
    //Coletando a prioridade
    var prioridade = document.getElementById("entrada_prioridade").options.selectedIndex;

    console.log(titulo);
    console.log(descricao);
    console.log(categoria);
    console.log(prioridade);
}