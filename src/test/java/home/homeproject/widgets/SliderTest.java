package home.homeproject.widgets;

import com.homeproject.pages.internetSite.SidePanel;
import com.homeproject.pages.widgets.SliderPage;
import home.homeproject.core.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SliderTest extends TestBase {

    @BeforeEach
    public void precondition() {
        new SidePanel(driver).clickOnSlider();
    }

    @Test
    public void sliderTest() {
        new SliderPage(driver).moveSliderToHorizontalDirection()
                .verifySliderValue("5");

    }
}