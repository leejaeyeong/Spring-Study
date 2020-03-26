package com.springboot.ljy;

import com.springboot.ljy.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_테스트() {
        //given
        String name = "hello";
        int amout = 10;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amout);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo((amout));
    }
}
