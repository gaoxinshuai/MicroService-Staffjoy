package xyz.staffjoy.web.view;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/*
 *
 * 重置页
 *
 * @Author:Zh1Cheung 945503088@qq.com
 * @Date: 10:17 2019/12/30
 *
 */
@Getter
@Setter
public class ResetPage extends Page {
    private boolean denied;
    private String recaptchaPublic;

    // lombok inheritance workaround, details here: https://www.baeldung.com/lombok-builder-inheritance
    @Builder(builderMethodName = "childBuilder")
    public ResetPage(String title, String description, String templateName, String cssId, String version, boolean denied, String recaptchaPublic) {
        super(title, description, templateName, cssId, version);
        this.denied = denied;
        this.recaptchaPublic = recaptchaPublic;
    }
}
