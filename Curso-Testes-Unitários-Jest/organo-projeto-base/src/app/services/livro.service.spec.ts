import { Livro } from "../componentes/livro/livro";
import { LivroService } from "./livro.service"

describe('LivroService', () => {
    let service : LivroService;

    it('deveria ser criado', () =>{
        service = new LivroService();
        expect(service).toBeTruthy();
    })

   //Código omitido

it('deveria adicionar um novo livro', () => {
    service = new LivroService();
    const novoLivro: Livro = {
        titulo: 'Novo Livro',
        autoria: 'Autor Desconhecido',
        imagem: 'http://example.com/cover.jpg',
        genero: {id: 'romance', value: 'Romance'},
        dataLeitura: '2024-04-19',
        classificacao: 5 
        
    }});
});

