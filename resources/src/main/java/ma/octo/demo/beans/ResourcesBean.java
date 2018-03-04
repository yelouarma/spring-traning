package ma.octo.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ResourcesBean {

    @Autowired
    private ResourceLoader resourceLoader;

    public Resource[] loadUsingResourcePatternUtils(String pattern) {
        try {
            return ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResources(pattern);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public Resource[] loadUsingPathMatchingResourcePatternResolver(String pattern) {
        try {
            return new PathMatchingResourcePatternResolver(this.getClass().getClassLoader()).getResources(pattern);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
