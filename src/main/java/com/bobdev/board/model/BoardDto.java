package com.bobdev.board.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int no;
    private String title;
    private String content;
    private String regdate;
}
