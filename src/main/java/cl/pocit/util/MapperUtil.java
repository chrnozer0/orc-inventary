package cl.pocit.util;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.List;
import java.util.stream.Collectors;

public class MapperUtil {
    private static final Mapper DOZER_MAPPER = DozerBeanMapperBuilder.buildDefault();

    private MapperUtil() {
        throw new IllegalStateException("Utility mapper class");
    }

    /**
     * map object to object
     * @param source
     * @param destinationClass
     * @return
     * @param <T>
     * @param <U>
     */
    public static <T, U> U map(T source, Class<U> destinationClass) {
        return DOZER_MAPPER.map(source, destinationClass);
    }

    /**
     * map list to list
     * @param sourceList
     * @param destinationClass
     * @return
     * @param <T>
     * @param <U>
     */
    public static <T, U> List<U> mapList(List<T> sourceList, Class<U> destinationClass) {
        return sourceList.stream()
                .map(sourceObject -> DOZER_MAPPER.map(sourceObject, destinationClass))
                .collect(Collectors.toList());
    }
}