package ru.microbyte.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.microbyte.xml.PrintData;
import ru.microbyte.xml.PrintService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/context-test.xml"})
public class PhotoPrintServiceTest {

    @Autowired
    @Qualifier("photoPrintService")
    PrintService printService;

    @Test
    public void test() throws Exception {
        printService.print(new PrintData("test"));
    }
}