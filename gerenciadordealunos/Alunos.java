package gerenciador_de_alunos;

class Alunos{
    public static void main(String[] args) {
        
        for(int i = 0; i < agendamentos.size(); i++){
            Agendamento ag = agendamentos.get(i);
            System.out.println("Cliente: " + ag.getNome());
            System.out.println("Horario: " + ag.getHorario());
        }
    }
}