package builder;

import java.util.List;

public class ExercicioBuilder implements EcercicioFactory{

	private String descricao;
	private List<TipoExercicio> tipos;
	private List<GrupoMuscular> grupoMusculares;
	private List<Equipamento> equipamentos;
	
	public static ExercicioBuilder getFactory() {
		return new ExercicioBuilder();
	}
	
	@Override
	public ExercicioFactory getFactory() {
		return new ExercicioBuilder();
	}
	
	@Override
	public ExercicioFactory clear() {
		this.descricao = null;
		this.tipos = new ArrayList<GrupoMuscular>();
		this.equipamentos = new ArrayList<Equipamentos>();
		return this;
	}
	
	@Override
	public ExercicioFactory descricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public ExercicioFactory withTipo(TipoExercicio tipo) {
		this.tipos.add(tipo);
	}
	@Override
	public ExercicioFactory withGrupoMuscular(GrupoMuscular grupo) {
		this.grupoMusculares.add(grupo);
		return this;
	}
	@Override
	public ExercicioFactory withEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
		return this;
	}
	@Override
	public Exercicio build(String id) {
		return new Exercicio(id, this.descricao, tipos, grupoMusculares, equipamentos);
	}
}







