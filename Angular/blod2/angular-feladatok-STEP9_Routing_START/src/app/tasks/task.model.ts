export class Task {
    public name: string;
    public state: number;
    public description: string;

    constructor(name: string, state: number, description: string) {
        this.name = name;
        this.state = state;
        this.description = description;
    }
}