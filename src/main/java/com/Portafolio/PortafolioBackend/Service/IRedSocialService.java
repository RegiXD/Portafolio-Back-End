package com.Portafolio.PortafolioBackend.Service;

import com.Portafolio.PortafolioBackend.Model.RedSocial;
import java.util.List;

public interface IRedSocialService {
    public List<RedSocial> FindRedSocialById(Long id_Usuario);
}
