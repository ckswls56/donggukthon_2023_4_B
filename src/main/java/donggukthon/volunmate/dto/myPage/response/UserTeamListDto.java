package donggukthon.volunmate.dto.myPage.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.io.Serializable;
import java.util.List;

@Builder
public record UserTeamListDto (
        @JsonProperty("res")
        List<UserTeamDto> res
) implements Serializable {
    public static UserTeamListDto of(List<UserTeamDto> res) {
        return UserTeamListDto.builder()
                .res(res)
                .build();
    }
}
