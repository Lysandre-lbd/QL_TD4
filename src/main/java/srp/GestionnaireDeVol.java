package srp;

public class GestionnaireDeVol {
  private final VolRepository volRepository;

  public GestionnaireDeVol(VolRepository volRepository) {
    this.volRepository = volRepository;
  }

  public Siege assigner(int volId, PassagerType passagerType) {
    Vol vol = volRepository.findById(volId);
    return vol.assignerSiege(passagerType);

  }



}