class ProgressaoAritmetica extends Progressao {
    private int Numinicial;
    private int Numatual;
    private int razao;

    public ProgressaoAritmetica(int inicial, int razao){
        this.Numinicial=Numinicial;
        this.Numatual=Numatual;
        this.razao=razao;
    }

    @Override
    public int proximo(){
        int valor = Numatual;
        Numatual += razao;
        return valor;
    }
    @Override
    public void reiniciaSeq(){
        Numatual = Numinicial;
    }
}
