package builder;

public interface ExercicioFactory {

	public ExercicioFactory clear();
	public ExercicioFactory descricao(String descricao);
	public ExercicioFactory withTipo(TipoExercicio tipo);
	public ExercicioFactory withGrupoMuscular(GrupoMuscular grupo);
	public ExercicioFactory withEquipamento(Equipamento equipamento);
	public Exercicio build(String id);
}
