alert('Boas vindas ao jogo do número secreto');
let numeroSecreto = 9;

let chute = prompt('Escolha um número entre 1 e 10');
console.log('Valor do chute:', chute);
// se chute for igual ao número secreto

console.log('Resultado da comparação:', chute == numeroSecreto);
if(chute == numeroSecreto){
    alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto}`);
     console.log('Valor do número secreto:', numeroSecreto);
}
else{
    alert('Você errou :(');
}