/* EXERCICIO 1 - IMC*/

function calcularIMC(altura, peso){
    let imc = peso/ (altura * altura);
    console.log(`Seu IMC é de ${imc} kg/m2`);
}

calcularIMC(1.75, 85,6);

/* EXERCICIO 2 - FATORIAL*/


function fatorial(numero){
    if( numero === 0 || numero === 1){
        return 1;
    }

    let fatorial =  1;

    for(let i = 2; i <= numero; i++){
        fatorial *= i;
    }

    return fatorial;
}

let num = 5; 
resultado = fatorial(num);
console.log(`O fatorial de ${num} é ${resultado}`);

/* EXERCICIO 3 - COTAÇÃO DOLAR*/

function converterDolar(valorEmDolar){
   let cotacaoDolar = 4.80;
   let valorEmReais = valorEmDolar * cotacaoDolar;
   return valorEmReais;
}

let valorDolar = 50;
let valorReais = converterDolar(valorDolar);
console.log(`${valorDolar} dólares equivalem a R$ ${valorReais}`);

/* EXERCICIO 4 - Area e Perimetro de Rentagulo*/

function areaRetangulo(altura, largura){
    let area = altura * largura;
    let perimetro = 2 * (altura + largura);

    console.log(`Área da sala: ${area} metros quadrados.`);
    console.log(`Perímetro da sala: ${perimetro} metros.`);
}

let altura = 5;
let largura = 2;

areaRetangulo(altura, largura);

/* EXERCICIO 5 -  Area e Perimetro Sala Circular*/

function areaCircular(raio){
    let area = Math.PI * raio * raio;
    let perimetro = 2 * Math.PI * raio;

    console.log(`Área da sala circular: ${area.toFixed(2)} metros quadrados.`);
    console.log(`Perímetro da sala circular: ${perimetro.toFixed(2)} metros.`);
}

let raio = 2;

areaCircular(raio);

/* EXERCICIO 6 -  Tabuada */

function mostrarTabuada(numero){
    for(let i = 1; i <= 10 ; i++){
        let resultado = numero * i;
        console.log(`${numero} x ${i} = ${resultado}`);
    }
}

let numero = 2;
mostrarTabuada(numero);