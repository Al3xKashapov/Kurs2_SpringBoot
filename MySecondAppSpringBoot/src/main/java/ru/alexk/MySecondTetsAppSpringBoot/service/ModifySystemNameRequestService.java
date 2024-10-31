package ru.alexk.MySecondTetsAppSpringBoot.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.alexk.MySecondTetsAppSpringBoot.model.Request;

import static ru.alexk.MySecondTetsAppSpringBoot.model.Systems.SRVC;

@Service
public class ModifySystemNameRequestService implements ModifyRequestService{

    @Override
    public void modify(Request request){
        request.setSystemName(SRVC);
        request.setSource("Service_1");
        request.setStart(request.getStart());

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}
