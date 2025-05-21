let texto = document.querySelector('h1');
texto.innerHTML = 'Hora do Desafio';

function clicarBotaoConsole(){
    console.log('O botão foi clicado');
}

function exibirAlerta(){
    alert('Eu amo JS');
}

function exibirPrompt(){
    let nomeDaCidade = prompt('Digite o nome de uma cidade do Brasil: ');
    alert(`Estive em ${nomeDaCidade} e lembrei de você`);
}

function somarDoisNumeros(){
    let numero1 = parseInt(prompt('Digite o primeiro número: '));
    let numero2 = parseInt(prompt('Digite o segundo número: '));
    let soma = numero1 + numero2;
    alert(`${numero1} + ${numero2} = ${soma}`)
}