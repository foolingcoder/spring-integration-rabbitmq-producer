package mu.integration.consumer.rabbitmq.entity;

import lombok.Data;

/**
 *
 * @author priteela
 */
@Data
public class CsvLineInformation {

    private String id;

    private String line;

    private String fileName;

    private String status;

}
