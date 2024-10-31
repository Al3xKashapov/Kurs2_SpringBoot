package ru.alexk.MySecondTetsAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.alexk.MySecondTetsAppSpringBoot.model.Response;

import java.util.UUID;

@Service
@Qualifier
public class ModifyOperationUidResponseService
    implements ModifyResponseService {

    @Override
    public Response modify (Response response){
        UUID uuid = UUID.randomUUID();
        response.setOperationUid(uuid.toString());
        return response;
    }
}
