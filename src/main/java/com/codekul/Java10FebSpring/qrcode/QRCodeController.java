package com.codekul.Java10FebSpring.qrcode;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class QRCodeController {

    private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode.png";

    @GetMapping(value = "/genrateQRCode/{codeText}")
    public ResponseEntity<byte[]> generateQRCode(HttpServletResponse response,
                                                 @PathVariable("codeText") String codeText)
            throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(QRCodeGenerator.getQRCodeImage(codeText));
    }
}
