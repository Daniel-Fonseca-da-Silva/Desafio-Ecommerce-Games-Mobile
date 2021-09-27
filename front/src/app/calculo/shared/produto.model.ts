export class Produto {

    constructor(
        public id: number = 1,
        public name: string = 'Age of Empires 4',
        public price: number = 300.00,
        public score: number = 10,
        public img?: string,
    ){}
}
