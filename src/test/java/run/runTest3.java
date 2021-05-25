package run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//旧版本标签的配置如下
//  tags = {"@st"},    表示只执行有@st标记的scenario
//  tags = {"@st","@dt"},   表示只执行同时含有@st和@dt标记的scenario
//  tags = {"@st","~@dt"},  表示执行有@st标记的同时排除标记有@dt标记的scenario
//  tags = {"@st,@dt"},   表示执行有@st和@dt标记的scenario
//
//新版本做了改动
//  tags = "(@st or @ft) and not @dt" ，表示执行带有@st或@ft，同时排除标记有@dt标记的scenario
@CucumberOptions(
        features = "src/test/features/fist_cucumber.feature",
        plugin = {"pretty",
                "json:target/report.json"},
        glue = ("com.steps"),
        tags = ("@p1")//@p0 表示只运行有这个标签的case， ~@p0表示运行除了p0以外的所有标签
)
public class runTest3 extends AbstractTestNGCucumberTests {
}
