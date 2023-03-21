const dados = require('./dados.json')
const vetorJson = dados.map(objeto => objeto.valor)

const vetor = vetorJson.filter(valor => valor !== 0)

const menorValor = Math.min(...vetor)
const maiorValor = Math.max(...vetor)

// Calcula a média dos valores do array "valores"
const soma = vetor.reduce((total, valor) => total + valor, 0);
const media = soma / vetor.length;

let diasAcimaDaMedia = 0
for(let i = 0; i<vetor.length; i++) {
    if(vetor[i] > media) diasAcimaDaMedia ++
}

console.log(`Maior Valor: ${maiorValor}\nMenor Valor: ${menorValor}\nNúmero de dias com faturamento maior que a média: ${diasAcimaDaMedia}`);